import 'package:flutter/material.dart';
import 'package:login_test/pages/HomePage.dart';
import 'package:login_test/pages/LoginPage.dart';

void main() {
  runApp(const CustomLoginApp());
}

class CustomLoginApp extends StatelessWidget {
  const CustomLoginApp({Key? key}) : super(key: key);

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
