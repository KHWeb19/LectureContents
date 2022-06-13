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
      // InheritedWidget을 상속해서 내부에서 사용하는 컴포넌트끼리 정보를 주고받을 수 있게 만들어줬음
      // 좀 더 쉽게해서 vuex의 store 기능을 활용할 수 있도록 만들어줬음
      // 조금 더 쉽게 얘기해서 state 관리
      home: PhotoInheritedWidget(
        viewModel: HomeViewModel(KakaoApi()),
        child: const HomeScreen(),
      ),
    );
  }
}
