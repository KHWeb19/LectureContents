import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class ProfileHeader extends StatelessWidget {
  const ProfileHeader({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Row(
      children: [
        const SizedBox(width: 20),
        _buildHeaderAvatar(),
        const SizedBox(width: 20),
        _buildHeaderProfile()
      ],
    );
  }

  Widget _buildHeaderAvatar() {
    return const SizedBox(
      width: 100,
      height: 100,
      child: CircleAvatar(
        backgroundImage: AssetImage('assets/sepiroth.jpg'),
      ),
    );
  }

  Widget _buildHeaderProfile() {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: const [
        Text(
          "파이널 판타지 7 세피로스",
          style: TextStyle(fontSize: 23, fontWeight: FontWeight.w700),
        ),
        Text(
          "직장: 스퀘어 에닉스(신라)",
          style: TextStyle(fontSize: 20)
        ),
        Text(
          "하고싶은말: 리메이크 파트2 언제 나옴 ?",
          style: TextStyle(fontSize: 15),
        )
      ],
    );
  }
}
