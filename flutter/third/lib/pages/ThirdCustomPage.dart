import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

import '../components/ThirdCustomAppListItem.dart';
import '../components/ThirdCustomAppMenu.dart';
import '../components/ThirdCustomAppTitle.dart';

class ThirdCustomPage extends StatelessWidget {
  const ThirdCustomPage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.white,
      appBar: _buildThirdCustomAppBar(),
      body: Padding(
        padding: const EdgeInsets.symmetric(horizontal: 20),
        child: ListView(
          padding: const EdgeInsets.symmetric(horizontal: 20),
          children: const [
            ThirdCustomAppTitle(),
            ThirdCustomAppMenu(),
            ThirdCustomAppListItem("porsche918", "신규 포르쉐 업그레이드", "1,200,000,000 원"),
            ThirdCustomAppListItem("rangerover", "레인지 로버 중고", "50,000,000 원"),
          ],
        )
      ),
    );
  }

  AppBar _buildThirdCustomAppBar () {
    return AppBar(
      backgroundColor: Colors.white,
      elevation: 1.0,
      actions: const [
        Icon(
          CupertinoIcons.search,
          color: Colors.black
        ),
        SizedBox(width: 15),
        Icon(
            CupertinoIcons.antenna_radiowaves_left_right,
            color: Colors.green
        ),
        SizedBox(width: 15),
      ],
    );
  }
}
