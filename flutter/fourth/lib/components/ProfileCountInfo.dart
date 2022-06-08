import 'package:flutter/cupertino.dart';

class ProfileCountInfo extends StatelessWidget {
  const ProfileCountInfo({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.spaceAround,
      children: [
        _buildInfo("77", "포스팅"),
        _buildLine(),
        _buildInfo("33", "좋아요"),
        _buildLine(),
        _buildInfo("12", "공유됨"),
      ],
    );
  }

  Widget _buildInfo(String count, String title) {
    return SizedBox();
  }

  Widget _buildLine() {
    return SizedBox();
  }
}
