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

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignatureManagerFragment extends Fragment {

    private ArrayList<Signature> signaturesArrayList = new ArrayList<Signature>();

    @Bind(R.id.signature_list_View)
    SwipeMenuListView mSignaureListView;

    public SignatureManagerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_signature_manager, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initSignature();
        SignatureAdapter adapter = new SignatureAdapter(getActivity(), R.layout.signature_item, signaturesArrayList);
        mSignaureListView.setAdapter(adapter);

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
        mSignaureListView.setMenuCreator(creator);

    }

    private void initSignature() {
        Signature sig1 = new Signature("1","111","111111","TYPED");
        signaturesArrayList.add(sig1);
        Signature sig2 = new Signature("2","222","222222","TYPED");
        signaturesArrayList.add(sig2);
        Signature sig3 = new Signature("3","333","333333","HAND");
        signaturesArrayList.add(sig3);
        Signature sig4 = new Signature("4","444","444444","TYPED");
        signaturesArrayList.add(sig4);
        Signature sig5 = new Signature("5","555","555555","HAND");
        signaturesArrayList.add(sig5);
        Signature sig6 = new Signature("6","666","666666","TYPED");
        signaturesArrayList.add(sig6);
        Signature sig7 = new Signature("7","777","777777","HAND");
        signaturesArrayList.add(sig7);

    }
}
