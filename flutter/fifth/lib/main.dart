import 'package:fifth/pages/HomePage.dart';
import 'package:fifth/pages/LoginPage.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(const FifthCustomApp());
}

class FifthCustomApp extends StatelessWidget {
  const FifthCustomApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      initialRoute: "/login",
      routes: {
        "/login": (context) => LoginPage(),
        "/home": (context) => HomePage()
      },
    );
  }
}

