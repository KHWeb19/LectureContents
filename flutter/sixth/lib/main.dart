import 'package:flutter/material.dart';
import 'package:sixth/data/kakao_api.dart';
import 'package:sixth/data/photo_inherited_widget.dart';
import 'package:sixth/ui/home_screen.dart';
import 'package:sixth/ui/home_view_model.dart';

void main() {
  runApp(const SixthCustomApp());
}

class SixthCustomApp extends StatelessWidget {
  const SixthCustomApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Kakao Img API',
      theme: ThemeData(
        primarySwatch: Colors.blue
      ),
      home: PhotoInheritedWidget(
        viewModel: HomeViewModel(KakaoApi()),
        child: const HomeScreen(),
      ),
    );
  }
}
