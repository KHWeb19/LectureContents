import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class ThirdCustomAppListItem extends StatelessWidget {
  final String imageName;
  final String title;

  const ThirdCustomAppListItem(this.imageName, this.title);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: 20),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Image.asset("assets/$imageName.png", fit: BoxFit.cover),
          SizedBox(height: 10),
          Text(title, style: TextStyle(fontSize: 20)),
          Text("1,200,000,000 원")
        ],
      ),
    );
  }
}
