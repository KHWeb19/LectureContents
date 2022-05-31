import 'package:flutter/material.dart';

import 'package:second/map_test.dart';
import 'package:second/selective_parameter.dart';

import 'cascade_grammar.dart';
import 'extends_test.dart';
import 'list_test.dart';

void main() {
  selective_parameter_test();
  cascade_grammar_test();
  extends_test();

  List<int> listRef = list_test();
  list_add_test(listRef);
  print(listRef);
  list_rm_test(listRef);
  print(listRef);
  print("length: ${listRef.length}");

  Map mapTest = map_test();
  map_add_test(mapTest);
  map_addAll_test(mapTest);
  map_findByValue_test(mapTest);
  map_updateByKey_test(mapTest);

  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      debugShowCheckedModeBanner: false,
      home: TestPage(),
    );
  }
}

class TestPage extends StatelessWidget {
  const TestPage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: SafeArea(
        child: Column(
            children: [
              Padding(
                padding: const EdgeInsets.all(25.0),
                child: Row(
                  children: const [
                    Text("1조", style: TextStyle(fontWeight: FontWeight.bold),),
                    Spacer(),
                    Text("2조", style: TextStyle(fontWeight: FontWeight.bold),),
                    Spacer(),
                    Text("3조", style: TextStyle(fontWeight: FontWeight.bold),),
                    Spacer(),
                    Text("4조", style: TextStyle(fontWeight: FontWeight.bold),),
                  ],
                ),
              ),
              Expanded(
                child:
                  Image.asset("assets/linus.jpg", fit: BoxFit.cover),
              ),
              const SizedBox(height: 5,),
              Expanded(child: Image.asset("assets/mario.png", fit: BoxFit.cover)),
            ],
        ),
      )
    );
  }
}

