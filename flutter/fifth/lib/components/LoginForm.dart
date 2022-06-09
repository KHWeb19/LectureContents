import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

import '../utility/size.dart';
import 'LoginFormTextField.dart';

class LoginForm extends StatelessWidget {
  final _formKey = GlobalKey<FormState>();

  @override
  Widget build(BuildContext context) {
    return Form(
      key: _formKey,
      child: Column(
        children: [
          LoginFormTextField("이메일"),
          SizedBox(height: m_gap),
          LoginFormTextField("비밀번호"),
          SizedBox(height: l_gap),
          TextButton(
            onPressed: () {
              if (_formKey.currentState!.validate()) {
                Navigator.pushNamed(context, "/home");
              }
            },
            child: Text("로그인")
          )
        ],
      ),
    );
  }
}
