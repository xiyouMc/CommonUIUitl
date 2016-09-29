添加默认分割线：高度为2px，颜色为灰色

mRecyclerView.addItemDecoration(new RecycleViewDivider(mContext, LinearLayoutManager.VERTICAL));
添加自定义分割线：可自定义分割线drawable

mRecyclerView.addItemDecoration(new RecycleViewDivider(
    mContext, LinearLayoutManager.VERTICAL, R.drawable.divider_mileage));
添加自定义分割线：可自定义分割线高度和颜色

mRecyclerView.addItemDecoration(new RecycleViewDivider(
    mContext, LinearLayoutManager.VERTICAL, 10, getResources().getColor(R.color.divide_gray_color)));
