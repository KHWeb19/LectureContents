import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

import '../utility/size.dart';

class LoginFormTextField extends StatelessWidget {
  final String text;

  const LoginFormTextField(this.text);

  @override
  Widget build(BuildContext context) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Text(text),
        const SizedBox(height: s_gap),
        TextFormField(
          validator: (value) => value!.isEmpty ? "값을 입력하세요" : null,
          obscureText: text == "Password" ? true : false,
          decoration: InputDecoration(
            hintText: "Enter $text",
            enabledBorder: 
              OutlineInputBorder(borderRadius: BorderRadius.circular(20)),
            focusedBorder:
              OutlineInputBorder(borderRadius: BorderRadius.circular(20)),
            errorBorder:
              OutlineInputBorder(borderRadius: BorderRadius.circular(20)),
            focusedErrorBorder:
              OutlineInputBorder(borderRadius: BorderRadius.circular(20)),
          ),
        )
      ],
    );
  }
}
