import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

import '../components/ProfileButtons.dart';
import '../components/ProfileCountInfo.dart';
import '../components/ProfileHeader.dart';
import '../components/ProfileTab.dart';

class ProfilePage extends StatelessWidget {
  const ProfilePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: _buildProfileAppBar(),
      body: Column(
        children: [
          const SizedBox(height: 20),
          const ProfileHeader(),
          const SizedBox(height: 20),
          const ProfileCountInfo(),
          const SizedBox(height: 20),
          const ProfileButtons(),
          Expanded(child: ProfileTab())
        ],
      )
    );
  }

  AppBar _buildProfileAppBar() {
    return AppBar(
      leading: const Icon(Icons.arrow_back_ios),
      title: const Text("프로필"),
      centerTitle: true,
    );
  }
}
