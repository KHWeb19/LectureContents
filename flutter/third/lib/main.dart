import 'package:flutter/material.dart';
import 'package:third/pages/ThirdCustomPage.dart';

void main() {
  runApp(const ThirdCustomApp());
}

class ThirdCustomApp extends StatelessWidget {
  const ThirdCustomApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData(fontFamily: "NanumMyeongjo"),
      home: ThirdCustomPage(),
    );
  }
}
