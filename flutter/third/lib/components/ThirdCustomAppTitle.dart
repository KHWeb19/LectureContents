import 'package:flutter/cupertino.dart';

class ThirdCustomAppTitle extends StatelessWidget {
  const ThirdCustomAppTitle({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return const Padding(
        padding: EdgeInsets.only(top: 20),
        child: Text(
          "EDDI 플러터 테스트",
          style: TextStyle(fontSize: 30),
        )
    );
  }
}
