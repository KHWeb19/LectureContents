import 'package:flutter/material.dart';

import '../components/Logo.dart';
import '../utility/size.dart';

class LoginPage extends StatelessWidget {
  const LoginPage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: ListView(
          children: [
            SizedBox(height: xl_gap),
            Logo("로그인")
          ],
        ),
      )
    );
  }
}
