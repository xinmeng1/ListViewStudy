package tk.mengxin.listviewstudy;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.baoyz.swipemenulistview.SwipeMenu;
import com.baoyz.swipemenulistview.SwipeMenuCreator;
import com.baoyz.swipemenulistview.SwipeMenuItem;
import com.baoyz.swipemenulistview.SwipeMenuListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 *
 * We will display a list view with custom item view in this fragment:
 *
 * 1. Create a class which will show as an item in the List view.
 * 2. Create a item view
 * 3. Create a adapter for the class and the view
 *
 * A simple {@link Fragment} subclass.
 */
public class ListViewFragment extends Fragment {

    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Bind(R.id.list_View)
    SwipeMenuListView mListView;

    public ListViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_view, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //Load the List view

        //There are 3 step:
        initFruits(); // 初始化水果数据
        FruitAdapter adapter = new FruitAdapter(getActivity(),
                R.layout.fruit_item, fruitList);
        mListView.setAdapter(adapter);

        SwipeMenuCreator creator = new SwipeMenuCreator() {

            @Override
            public void create(SwipeMenu menu) {
                // create "open" item
                SwipeMenuItem openItem = new SwipeMenuItem(
                        getActivity().getApplicationContext());
                // set item background
                openItem.setBackground(new ColorDrawable(Color.rgb(0xC9, 0xC9,
                        0xCE)));
                // set item width
                openItem.setWidth(90);
                // set item title
                openItem.setTitle("Open");
                // set item title fontsize
                openItem.setTitleSize(18);
                // set item title font color
                openItem.setTitleColor(Color.WHITE);
                // add to menu
                menu.addMenuItem(openItem);

                // create "delete" item
                SwipeMenuItem deleteItem = new SwipeMenuItem(
                        getActivity().getApplicationContext());
                // set item background
                deleteItem.setBackground(new ColorDrawable(Color.rgb(0xF9,
                        0x3F, 0x25)));
                // set item width
                deleteItem.setWidth(90);
                // set a icon
                deleteItem.setIcon(R.drawable.ic_delete_24dp);
                // add to menu
                menu.addMenuItem(deleteItem);
            }
        };
        // set creator
        mListView.setMenuCreator(creator);

    }

    private void initFruits() {
        Fruit apple = new Fruit("Apple", R.drawable.ic_radio_24dp);
        fruitList.add(apple);
        Fruit banana = new Fruit("Banana", R.drawable.ic_radio_24dp);
        fruitList.add(banana);
        Fruit orange = new Fruit("Orange", R.drawable.ic_radio_24dp);
        fruitList.add(orange);
        Fruit watermelon = new Fruit("Watermelon", R.drawable.ic_radio_24dp);
        fruitList.add(watermelon);
        Fruit pear = new Fruit("Pear", R.drawable.ic_radio_24dp);
        fruitList.add(pear);
        Fruit grape = new Fruit("Grape", R.drawable.ic_radio_24dp);
        fruitList.add(grape);
        Fruit pineapple = new Fruit("Pineapple", R.drawable.ic_radio_24dp);
        fruitList.add(pineapple);
        Fruit strawberry = new Fruit("Strawberry", R.drawable.ic_radio_24dp);
        fruitList.add(strawberry);
        Fruit cherry = new Fruit("Cherry", R.drawable.ic_radio_24dp);
        fruitList.add(cherry);
        Fruit mango = new Fruit("Mango", R.drawable.ic_radio_24dp);
        fruitList.add(mango);
        Fruit apple1 = new Fruit("Apple", R.drawable.ic_radio_24dp);
        fruitList.add(apple1);
        Fruit banana1 = new Fruit("Banana", R.drawable.ic_radio_24dp);
        fruitList.add(banana1);
        Fruit orange1 = new Fruit("Orange", R.drawable.ic_radio_24dp);
        fruitList.add(orange1);
        Fruit watermelon1 = new Fruit("Watermelon", R.drawable.ic_radio_24dp);
        fruitList.add(watermelon1);
        Fruit pear1 = new Fruit("Pear", R.drawable.ic_radio_24dp);
        fruitList.add(pear1);
        Fruit grape1 = new Fruit("Grape", R.drawable.ic_radio_24dp);
        fruitList.add(grape1);
        Fruit pineapple1 = new Fruit("Pineapple", R.drawable.ic_radio_24dp);
        fruitList.add(pineapple1);
        Fruit strawberry1 = new Fruit("Strawberry", R.drawable.ic_radio_24dp);
        fruitList.add(strawberry1);
        Fruit cherry1 = new Fruit("Cherry", R.drawable.ic_radio_24dp);
        fruitList.add(cherry1);
        Fruit mango1 = new Fruit("Mango", R.drawable.ic_radio_24dp);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);
        fruitList.add(mango1);

    }
}
