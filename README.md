# Java_RecyclerView_StaggeredGridLayoutManager
![photo_2022-03-24_15-30-28](https://user-images.githubusercontent.com/60017090/159897137-191b21b6-54e9-4435-8ec6-64e19c595687.jpg)

![photo_2022-03-24_15-30-26](https://user-images.githubusercontent.com/60017090/159897001-fd649468-ccf9-4ed1-b194-83d06ac782ab.jpg)



//set imageview size in adapter class
 holder.imageView.setImageResource(dotaArrayList.get(position).getImagehero());
        if (position%2==1){
            holder.imageView.getLayoutParams().height= 320;
        }else {
            holder.imageView.getLayoutParams().height= 520;
        }



//LayoutManager

 recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
