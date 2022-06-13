import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:sixth/model/KakaoPhoto.dart';
import 'package:sixth/ui/photo_widget.dart';

import '../data/photo_inherited_widget.dart';

class HomeScreen extends StatefulWidget {
  const HomeScreen({Key? key}) : super(key: key);

  @override
  State<HomeScreen> createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  final _controller = TextEditingController();

  @override
  void dispose() {
    _controller.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    // vue에서 상태 관리를 위해 props를 사용했듯이
    // 여기서도 컴포넌트간 상태 관리를 위해 유사한 방식을 사용한다.
    final viewModel = PhotoInheritedWidget.of(context)?.viewModel;

    return Scaffold(
      appBar: AppBar(
        centerTitle: true,
        title: const Text(
          'Kakao Img Test App',
          style: TextStyle(color: Colors.black),
        ),
        backgroundColor: Colors.white,
        elevation: 0,
      ),
      body: Column(
        children: [
          Padding(
            padding: const EdgeInsets.all(16.0),
            child: TextField(
              controller: _controller,
              decoration: InputDecoration(
                border: const OutlineInputBorder(
                  borderRadius: BorderRadius.all(Radius.circular(10.0)),
                ),
                suffixIcon: IconButton(
                  onPressed: () async {
                    viewModel?.fetch(_controller.text);
                  },
                  icon: const Icon(Icons.search),
                )
              ),
            ),
          ),
          // 의존성을 분리시켰기 때문에
          // UI를 변경하고자 하는 경우
          // 단순히 UI 코드만 변경하면 된다.
          // 내부의 API를 변경하고 싶은 경우에도
          // 다른 UI들에 영향을 주는 것이 전혀 없다는 것!
          StreamBuilder<List<KakaoPhoto>>(
            stream: viewModel?.photoStream,
            builder: (context, snapshot) {
              if(!snapshot.hasData) {
                return const CircularProgressIndicator();
              }
              final kakaoPhotos = snapshot.data;

              return Expanded(
                child: GridView.builder(
                  padding: const EdgeInsets.all(16.0),
                  itemCount: kakaoPhotos?.length,
                  gridDelegate:
                    const SliverGridDelegateWithFixedCrossAxisCount(
                      crossAxisCount: 3,
                      crossAxisSpacing: 16,
                      mainAxisSpacing: 16
                    ),
                  itemBuilder: (context, index) {
                    final kakaoPhoto = kakaoPhotos![index];
                    return PhotoWidget(kakaoPhoto: kakaoPhoto);
                  }
                )
              );
            }
          )
        ],
      ),
    );
  }
}
