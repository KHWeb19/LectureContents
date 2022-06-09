import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

import '../components/Logo.dart';
import '../utility/size.dart';

class HomePage extends StatelessWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: Padding(
          padding: const EdgeInsets.all(16.0),
          child: ListView(
            children: [
              SizedBox(height: xxl_gap),
              Logo("에디로봇아카데미"),
              SizedBox(height: xm_gap),
              TextButton(
                onPressed: () {
                  Navigator.pop(context);
                },
                child: Text("시작!"),
              )
            ],
          ),
        )
    );
  }
}
