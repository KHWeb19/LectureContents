import 'package:flutter/cupertino.dart';

import '../ui/home_view_model.dart';

class PhotoInheritedWidget extends InheritedWidget {
  final HomeViewModel viewModel;

  const PhotoInheritedWidget(
    {Key? key, required this.viewModel, required Widget child})
    : super(key: key, child: child);

  static PhotoInheritedWidget? of(BuildContext context) {
    final PhotoInheritedWidget? result =
        context.dependOnInheritedWidgetOfExactType<PhotoInheritedWidget>();
    
    assert(result != null, "카카오 API 찾지못함");
    return result;
  }
  
  @override
  bool updateShouldNotify(InheritedWidget oldWidget) {
    return true;
  }
}