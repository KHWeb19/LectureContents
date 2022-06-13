import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

import '../api/spring_api.dart';
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
          const LoginFormTextField("이메일"),
          const SizedBox(height: m_gap),
          const LoginFormTextField("비밀번호"),
          const SizedBox(height: l_gap),
          TextButton(
            onPressed: () {
              SpringApi().login(UserLoginRequest("test@test.com", "test"));
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
