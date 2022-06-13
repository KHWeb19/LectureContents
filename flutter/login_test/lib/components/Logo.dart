import 'package:flutter/cupertino.dart';

class Logo extends StatelessWidget {
  const Logo(this.title);

  final String title;

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        const Image(
          image: AssetImage("assets/EDDI_eng.png"),
        ),
        Text(
          title,
          style: const TextStyle(fontSize: 40, fontWeight: FontWeight.bold),
        )
      ],
    );
  }
}
