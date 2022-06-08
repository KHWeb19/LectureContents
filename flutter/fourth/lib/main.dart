import 'package:flutter/material.dart';
import 'package:fourth/pages/ProfilePage.dart';

import 'components/AppTheme.dart';

void main() {
  runApp(const FourthCustomApp());
}

class FourthCustomApp extends StatelessWidget {
  const FourthCustomApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: theme(),
      home: ProfilePage()
    );
  }

  /*
  AppBar _buildProfileAppBar() {
    return AppBar();
  }
   */
}
