import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class ProfileCountInfo extends StatelessWidget {
  const ProfileCountInfo({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.spaceAround,
      children: [
        _buildInfo("5", "포스팅"),
        _buildLine(),
        _buildInfo("10073452", "좋아요"),
        _buildLine(),
        _buildInfo("10073452", "공유됨"),
      ],
    );
  }

  Widget _buildInfo(String count, String title) {
    return Column(
      children: [
        Text(count, style: const TextStyle(fontSize: 15)),
        const SizedBox(height: 2),
        Text(title, style: const TextStyle(fontSize: 15))
      ],
    );
  }

  Widget _buildLine() {
    return Container(width: 2, height: 60, color: Colors.blue,);
  }
}
