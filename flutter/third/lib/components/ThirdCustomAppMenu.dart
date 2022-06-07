import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class ThirdCustomAppMenu extends StatelessWidget {
  const ThirdCustomAppMenu({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.only(top: 20),
      child: Row(
        children: [
          _buildMenuItem(Icons.electric_car_outlined, "EV 충전"),
          SizedBox(width: 25),
          _buildMenuItem(Icons.highlight_outlined, "LED 디밍"),
          SizedBox(width: 25),
          _buildMenuItem(Icons.camera_alt_outlined, "스트리밍")
        ],
      ),
    );
  }

  Widget _buildMenuItem (IconData mIcon, String text) {
    return Container(
      width: 100,
      height: 80,
      decoration: BoxDecoration(
        borderRadius: BorderRadius.circular(30),
        border: Border.all(color: Colors.black26),
        color: Colors.white
      ),
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Icon(mIcon, color: Colors.redAccent, size: 30),
          SizedBox(height: 5),
          Text(
            text,
            style: TextStyle(color: Colors.black),
          )
        ],
      ),
    );
  }
}
