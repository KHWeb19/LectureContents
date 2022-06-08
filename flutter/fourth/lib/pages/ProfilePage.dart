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
          SizedBox(height: 20),
          ProfileHeader(),
          SizedBox(height: 20),
          ProfileCountInfo(),
          SizedBox(height: 20),
          ProfileButtons(),
          Expanded(child: ProfileTab())
        ],
      )
    );
  }

  AppBar _buildProfileAppBar() {
    return AppBar(
      leading: Icon(Icons.arrow_back_ios),
      title: Text("프로필"),
      centerTitle: true,
    );
  }
}
