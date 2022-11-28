package com.example.bavaria.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.bavaria.databinding.FragmentHomeBinding;
import com.example.bavaria.network.RetrofItItems;
import com.example.bavaria.ui.classes.Beneficiary;
import com.example.bavaria.ui.classes.BranchAddress;
import com.example.bavaria.ui.classes.Buyer;
import com.example.bavaria.ui.classes.CommercialDiscountDatum;
import com.example.bavaria.ui.classes.Contractor;
import com.example.bavaria.ui.classes.DocumentType;
import com.example.bavaria.ui.classes.ExtraReceiptDiscountDatum;
import com.example.bavaria.ui.classes.Header;
import com.example.bavaria.ui.classes.ItemDatum;
import com.example.bavaria.ui.classes.ItemDiscountDatum;
import com.example.bavaria.ui.classes.Root;
import com.example.bavaria.ui.classes.Seller;
import com.example.bavaria.ui.classes.TaxTotal;
import com.example.bavaria.ui.classes.TaxableItem;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        ObjectMapper mapper=new ObjectMapper();

        Root r=sentApi();
        Gson gson=new Gson();
       String cc= gson.toJson(r).intern();
    //    Log.d("sentApi",cc);
       // for(int i = 0; i<jobject.names().length(); i++){
       //     result="\""+jobject.names().getString(i).toUpperCase()+"\""+"\""+jobject.get(jobject.names().getString(i))+"\"";
       // }
       // r.setTotalAmount(500.0000);
        try {
           // mapper.
            String mapperSt=  mapper.writeValueAsString(r);
            Log.d("mapperSt",mapperSt);
            String    jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(r);
            Log.d("jsonInString", jsonInString);
          //  mapper.read
            try {
                JSONObject jsonObject = new JSONObject(mapperSt);
                Iterator<String> keys = jsonObject.keys();
                while(keys.hasNext()) {

                    String key = keys.next();
                    if (jsonObject .get(key) instanceof JSONObject) {
                      //  Log.d("trs",jsonObject .get(key).toString());
                        Log.d("trs",key);

                    }
                    }
                Log.d("mapperSt","////"+jsonObject .toString());

            }catch (JSONException err){
                Log.d("Error", err.toString());
            }

        String c=    mapperSt.replace("{","").replace("}","")
                    .replace("[","").replace("]","")
                    .replace("null","").replace(",","")
                .replace(":","");

   //     Log.d("sentApi",c);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


       /* final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        */

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //binding = null;
    }
    public String computeHash(String input) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.reset();

        byte[] byteData = digest.digest(input.getBytes("UTF-8"));
        //   StringBuffer sb = new StringBuffer();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();
    }
    public ArrayList<ItemDatum> getItems(){
        ArrayList<CommercialDiscountDatum> commercialDiscountData=new ArrayList<>();
        commercialDiscountData.add(new CommercialDiscountDatum());

        ArrayList<ItemDiscountDatum> itemDiscountData=new ArrayList<>();
        itemDiscountData.add(new ItemDiscountDatum());

        ArrayList<TaxableItem> taxableItems=new ArrayList<>();
        taxableItems.add(new TaxableItem());

        ItemDatum z=new ItemDatum(  "29130",
                "فلامنكو",
                "GS1",
                "99999999",
                "EA",
                1.0,
                50.0,
                50.00,
                50.00,
                57.000,commercialDiscountData,itemDiscountData,0,taxableItems);

        ArrayList<ItemDatum> itemData=new ArrayList<>();
        itemData.add(z);
        itemData.add(z);
        itemData.add(z);

        return itemData;
    }
    public Root sentApi(){
        //   Date df = new Date();
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        String formattedDate = df.format(c);
        //   Date df = new Date("yyyy-MM-dd'T'HH:mm:ss'Z'");
        Header header=new Header(
                "2022-11-23T07:06:06Z",
                //df,
                "815",
                "",
                //"a5c56d8fc504e8be9e65d828e41de21d1bd7c21b32d1a8eca9bb2af6e7d0ac8d",
                "",

                ""
        );
        DocumentType d=new DocumentType();


        BranchAddress b=new BranchAddress( "EG",
                "Giza",
                "6 Oct",
                "Hyaber",
                "1",
                "",
                "",
                "",
                "",
                "");
        Seller s=new Seller(     "382107586",
                "Domino's Pizza Hyper One Branch",
                "2",
                b,
                "447788",
                "",
                "1071"
        );



        Buyer BU= new Buyer(  "p",
                "",
                "",
                "",
                "0");

        //       ArrayList<CommercialDiscountDatum> commercialDiscountData=new ArrayList<>();
        //       commercialDiscountData.add(new CommercialDiscountDatum());
//
        //       ArrayList<ItemDiscountDatum> itemDiscountData=new ArrayList<>();
        //       itemDiscountData.add(new ItemDiscountDatum());
//
//
        //       ArrayList<TaxableItem> taxableItems=new ArrayList<>();
        //       taxableItems.add(new TaxableItem());
//
        //       ItemDatum z=new ItemDatum(  "29130",
        //               "فلامنكو",
        //               "GS1",
        //               "99999999",
        //               "EA",
        //               1.0,
        //               50.0,
        //               50.00,
        //               50.00,
        //               57.000,commercialDiscountData,itemDiscountData,0,taxableItems);
//
        //       ArrayList<ItemDatum> itemData=new ArrayList<>();
        //       itemData.add(z);
        //       itemData.add(z);
        //       itemData.add(z);


        ArrayList<ExtraReceiptDiscountDatum> extraReceiptDiscountData=new ArrayList<>();

        extraReceiptDiscountData.add(new ExtraReceiptDiscountDatum());

        ArrayList<TaxTotal> taxTotals=new ArrayList<>();

        taxTotals.add(new  TaxTotal(21.000));


        Contractor contractor   =new Contractor( );
        Beneficiary beneficiary=new Beneficiary( );

        Root r=new Root(header,
                d
                ,
                s
                ,BU
                ,getItems(),
                150.00,
                0.0,
                0.0,
                extraReceiptDiscountData,
                150.00,
                0,
                171.000,
                taxTotals,
                "C",
                0,
                contractor,
                beneficiary);


        return r;
    }
}