import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class ThirdCustomAppListItem extends StatelessWidget {
  final String imageName;
  final String title;
  final String price;

  const ThirdCustomAppListItem(this.imageName, this.title, this.price);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: 20),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          AspectRatio(
              aspectRatio: 2.5 / 1,
              child: ClipRRect(
                borderRadius: BorderRadius.circular(20),
                child: Image.asset("assets/$imageName.png", fit: BoxFit.cover),
              ),
          ),
          SizedBox(height: 10),
          Text(title, style: TextStyle(fontSize: 20)),
          Text(price)
        ],
      ),
    );
  }
}
