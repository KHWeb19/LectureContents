import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class ProfileButtons extends StatelessWidget {
  const ProfileButtons({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.spaceAround,
      children: [
        _buildFollowButton(),
        _buildMessageButton(),
      ],
    );
  }

  Widget _buildFollowButton() {
    return InkWell(
      onTap: () {
        print("팔로우 버튼 클릭");
      },
      child: Container(
        alignment: Alignment.center,
        width: 150,
        height: 45,
        child: const Text("팔로우", style: TextStyle(color: Colors.white)),
        decoration: BoxDecoration(
          color: Colors.blue,
          borderRadius: BorderRadius.circular(10)
        )
      ),
    );
  }

  Widget _buildMessageButton() {
    return InkWell(
      onTap: () {
        print("메시지 보내기 버튼 클릭");
      },
      child: Container(
        alignment: Alignment.center,
        width: 150,
        height: 45,
        child: const Text("메시지", style: TextStyle(color: Colors.black)),
        decoration: BoxDecoration(
          color: Colors.white,
          borderRadius: BorderRadius.circular(10),
          border: Border.all()
        ),
      ),
    );
  }
}
