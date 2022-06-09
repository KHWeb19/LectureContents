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
      theme: ThemeData(
        textButtonTheme: TextButtonThemeData(
          style: TextButton.styleFrom(
            backgroundColor: Colors.black,
            primary: Colors.white,
            shape: RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(30)
            ),
            minimumSize: Size(400, 60)
          )
        )
      ),
      initialRoute: "/login",
      routes: {
        "/login": (context) => LoginPage(),
        "/home": (context) => HomePage()
      },
    );
  }
}

