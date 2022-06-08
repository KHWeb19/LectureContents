import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class ProfileTab extends StatefulWidget {
  @override
  _ProfileTabState createState() => _ProfileTabState();
}

class _ProfileTabState extends State<ProfileTab>
    with SingleTickerProviderStateMixin {
  TabController? _tabController;

  @override
  void initState() {
    super.initState();
    _tabController = TabController(length: 2, vsync: this);
  }

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        _buildTabBar(),
        Expanded(child: _buildTabBarView()),
      ],
    );
  }

  Widget _buildTabBar() {
    return TabBar(
      controller: _tabController,
      tabs: const [
        Tab(icon: Icon(Icons.camera_alt_outlined)),
        Tab(icon: Icon(Icons.star_border_outlined)),
      ],
    );
  }

  Widget _buildTabBarView() {
    return TabBarView(
      controller: _tabController,
      children: [
        GridView.builder(
          gridDelegate: const SliverGridDelegateWithFixedCrossAxisCount(
            crossAxisSpacing: 10,
            crossAxisCount: 3,
            mainAxisSpacing: 10
          ),
          itemCount: 42,
          itemBuilder: (context, index) {
            return Image.network(
              "https://picsum.photos/id/${index + 1}/200/300"
            );
          },
        ),
        GridView.builder(
          gridDelegate: const SliverGridDelegateWithFixedCrossAxisCount(
              crossAxisSpacing: 10,
              crossAxisCount: 3,
              mainAxisSpacing: 10
          ),
          itemCount: 42,
          itemBuilder: (context, index) {
            return Image.network(
                "https://picsum.photos/id/${index + 1}/200/200"
            );
          },
        ),
      ],
    );
  }
}