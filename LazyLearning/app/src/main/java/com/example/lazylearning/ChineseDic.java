package com.example.lazylearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class ChineseDic extends AppCompatActivity {
    ListView ChineseList;
    ArrayList<String> listItems5;
    ArrayAdapter<String> adapter5;
    EditText sChtext;
    String[] hdword={"中国 Zhōngguó ประเทศจีน ",
            "中文 Zhōngwén ภาษาจีน",
            "汉语 hànyǔ อักษรจีน",
            "月饼  Yuèbǐng ขนมไหว้พระจันทร์",
            "福建面 Fújiànmiàn หมี่ฮกเกี้ยน",
            "普吉岛 Pǔ jí dǎo ภูเก็ต",
            "董里府  Dǒng lǐ fǔ ตรัง",
            "曼谷 Màngǔ กรุงเทพ",
            "泰国 Tàiguó ประเทศไทย",
            "泰语  Tàiyǔ ภาษาไทย",
            "蚝煎 háo jiān โอวต้าว",
            "好梦 hǎo mèng ฝันดี",
            "食菜 shí cài  กินเจ",
            "哦 Ó โอ้ว",
            "没有 méiyǒu ไม่ ",
            "尊重 Zūnzhòng เคารพ(ไหว้พระ)",
            "拼音 pīnyīn พินอิน",
            "简体 jiǎntǐ แบบย่อ",
            "水 shuǐ น้ำ",
            "冰 bīng น้ำแข็ง",
            "地 de พื้นดิน",
            "风 fēng ลม",
            "火 huǒ ไฟ",
            "点心 diǎnxīn  ติ่มซำ",
            "油条  yóutiáo จ๋ากุ่ย",
            "白糖糕 báitáng gāo ป๋าท๋องโก๋",
            "蝦餃 Xiā jiǎo ฮะเก๋า",
            "餃 Jiǎo เกี๊ยว",
            "燒賣 shāomai ขนมจีบ",
            "酱油 Jiàngyóu  ซีอิ๋ว",
            "鱼露 Yú lù น้ำปลา",
            "中秋节 Zhōngqiū jié วันไหว้พระจันทร์",
            "清明節 Qīngmíng jié วันเชงเม้ง",
            "九皇勝會 jiǔ huáng shèng huì วันกินเจ",
            "台湾 Táiwān ไต้หวัน",
            "柬埔寨 jiǎnpǔzhài กัมพูชา",
            "老挝 Lǎowō ลาว",
            "缅甸 Miǎndiàn พม่า",
            "马来西亚 Mǎláixīyà มาเลเซีย",
            "新加坡 Xīnjiāpō สิงค์โปร์",
            "印度尼西亚 Yìndùníxīyà อินโดนีเซีย",
            "印度 Yìndù อินเดีย",
            "韩国 Hánguó เกาหลี",
            "意大利 Yìdàlì อิตาลี",
            "美国 Měiguó สหรัฐอเมริกา",
            "俄罗斯 Èluósī รัสเซีย",
            "东盟 Dōngméng อาเซียน",
            "熊 xióng ฉง หมี",
            "海 hǎi ทะเล",
            "岛屿 dǎoyǔ เกาะ",
            "年 nián เหนียน. ปี",
            "日期 rìqī รื้อฉี้. วันที่",
            "星期 xīnqī ชิงฉี้ สัปดาห์",
            "昨天 zuótiān โซวเทียน เมื่อวาน",
            "今天 jīntiān จินเทียน วันนี้",
            "明天 míngtiān หมิงเทียน พรุ่งนี้",
            "黄瓜 huángguā หวางกวา แตงกวา",
            "番茄 fānqié.ฟานเฉ มะเขือเทศ",
            "称 chēng โทรศัพท์",
            "冰淇淋 bīngqílín ไอศครีม",
            "好想你 hǎoxiǎngnǐ ฉันคิดถึงคุณ",
            "女生 nusheng หญิงสาว",
            "新加坡 xīnjiāpō สิงคโปร์",
            "太美了 tàiměile สวยงามมาก",
            "不用担心 bùyòng dānxīn ไม่ต้องกังวล",
            "姓 xìng ซิ่ง แซ่",
            "做个好梦 zuò gé hǎo měng ฝันดี",
            "蝙蝠 biānfú เปียนฝุ ค้างคาว",
            "豆浆 Dòujiāng น้ำเต้าหู้"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese_dic);
        ChineseList = (ListView)findViewById(R.id.ListDicChi);
        sChtext = (EditText) findViewById(R.id.txSdicChinesse);
        initList1();
        sChtext.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().equals("")){
                    //reset listview
                    initList1();
                }
                else {
                    //perform search
                    searchItem1(s.toString());

                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                // perform search
            }
        });
    }
    public void searchItem1(String textToSearch){
        for (String hdword1:hdword){
            if (!hdword1.contains(textToSearch)){
                listItems5.remove(hdword1);
            }
        }
        adapter5.notifyDataSetChanged();
    }
    public void initList1(){
        listItems5 = new ArrayList<>(Arrays.asList(hdword));
        adapter5 = new ArrayAdapter<String>(this,R.layout.layoutlist,R.id.textOutList,listItems5);
        ChineseList.setAdapter(adapter5);
        ChineseList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ChineseDic.this,"List"+position,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
