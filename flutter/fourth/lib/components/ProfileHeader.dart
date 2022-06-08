import 'package:flutter/cupertino.dart';

class ProfileHeader extends StatelessWidget {
  const ProfileHeader({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Row(
      children: [
        SizedBox(width: 20),
        _buildHeaderAvatar(),
        SizedBox(width: 20),
        _buildHeaderProfile()
      ],
    );
  }

  Widget _buildHeaderAvatar() {
    return SizedBox();
  }

  Widget _buildHeaderProfile() {
    return SizedBox();
  }
}
