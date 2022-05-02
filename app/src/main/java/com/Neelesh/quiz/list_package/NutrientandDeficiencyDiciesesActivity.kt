package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.CityFounderAdaptor
import com.Neelesh.quiz.data_class.City_Founders4

class NutrientandDeficiencyDiciesesActivity : AppCompatActivity() {

    lateinit var recyclernickname : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: CityFounderAdaptor
    val listofcity = arrayListOf<City_Founders4>(
        City_Founders4("Vitamin A", "Retinol, Retinoic Acid, Beta-Carotene" ,"Night-blindness,Healing epithelial cells,Normal development of teeth and bones" ,"Carrots, Papaya, Milk, Cheese, Fish Liver Oil, Green Vegetables etc."),
        City_Founders4("Vitamin B1" ,"Thiamine"," Beriberi" ,"Brewer’s Yeast, Whole Grain, Oatmeal, Legumes, Peanuts, Dried Soybean, Sunflower Seeds etc."),
        City_Founders4("Vitamin B2", "Riboflavin" ,"Ariboflavinosis" ,"Beef Liver, Lamb, Milk, Mushroom, Spinach, Almonds etc."),
        City_Founders4("Vitamin B3" ,"Niacin or Nicotinic Acid" ,"Pellagra","Tuna, Chicken, Turkey, Mushrooms , Bacon, Broccoli, Veal etc."),
        City_Founders4("Vitamin B5" ,"Pantothenic Acid" ,"Acne, Paresthesia" ,"Chicken Liver, Sunflower Seeds, Salmon, Avocados, Corn, Broccoli, Mushroom etc."),
        City_Founders4("Vitamin B6" ,"Pyridoxine, Pyridoxal, Pyridoxamine" ,"Dandruff-like eruptions, Pink eye, Epilepsy" ,"Potatoes & other starchy vegetables, Fruit (other than citrus) etc."),
        City_Founders4("Vitamin B7" ,"Biotin" ,"Growth & Neurological Disorders in Infants" ,"Raw Egg Yolk, Liver, Peanuts, Yeast, Whole-wheat Bread, Cheddar Cheese, Pork etc."),
        City_Founders4("Vitamin B9" ,"Folic Acid", "Macrocytic Anaemia, Birth Defects", "Dark Leafy Greens like Spinach, Asparagus, Broccoli, Citrus Fruits, Beans, Peas, Lentils, Avocados etc"),
        City_Founders4("Vitamin B12" ,"Various Cobalamins" ,"Macrocytic Anaemia, Memory Loss, Pernicious Anaemia, Mania, Psychosis, Paralysis" ,"Seafood, Beef, Chicken, Eggs etc."),
        City_Founders4("Vitamin C" ,"L-Ascorbic Acid" ,"Scurvy" ,"Amla, Guava, Chillis, Kiwi, Broccoli, Orange, Papaya, Lemon, etc."),
        City_Founders4("Vitamin D" ,"Calciferol (D2) & Cholecalciferol (D3)" ,"Rickets, Osteomalacia,Needed for absorption of calcium from small intestines,Calcification of the skeleton" ,"Sunlight, Mushrooms, Alfalfa, Fish Liver Oils, Cooked Egg Yolk, etc."),
        City_Founders4("Vitamin E" ,"Tochopherols & Tocotrienols" ,"Red Blood Cell Destruction, Ataxia, Retinopathy, Peripheral Neuropathy, Reproductive Failure" ,"Wheat Germ Oil, Canola Oil, Sunflower Oil, Almond Oil, Hazelnuts, Peanuts etc."),
        City_Founders4("Essential Fatty Acids" ,"Omega 3 (Alpha Linolenic Acid) and Omega 6 (Linolenic Acid)" ,"Several bodily processes afflicted, Skin Ailments" ,"Fish Oils, Flaxseed Oil, Hemp Oil, Olive Oil, Pumpkin Seeds, Leafy Vegetables etc."),
        City_Founders4("Vitamin K" ,"Phylloquinone (K1), Menaquinone (K2)" ,"Lack of Clotting of Blood, Lack of Tissue Renewal" ,"Green Leafy Vegetables etc."),
        City_Founders4("Iron" ,"","Anaemia, Arrhythmia" ,"Red Meat, Seafood, Egg Yolk, Bananas, Apple, Green Vegetables, Broccoli, Beans, Pumpkin Seeds etc."),
        City_Founders4("Potassium" ,"","High Blood Pressure, Arrhythmia, Muscle Weakness, Myalgia, Muscle Cramps, Constipation, Respiratory Depression, Paralysis" ,"Meat, Milk, Fruits, Vegetables, Whole Grains etc."),
        City_Founders4("Calcium" ,"","Osteoporosis, Hypocalcemia, Ostopenia" ,"Milk and Milk Products, Eggs, Wheatgrass etc."),
        City_Founders4("Magnesium" ,"","Deterioration of Metabolism & Cellular Functioning, Heart Attacks, Insulin Resistance" ,"Nuts and Seeds, Green Vegetables, Dark Chocolate, Whole Grains etc."),
        City_Founders4("Sodium" ,"","Cognitive Impairment, Headaches, Nausea, Seizure, Coma, Electrolytic Imbalance" ,"Salt, Fish, Meat, Vegetables etc."),
        City_Founders4("Chlorine" ,"","alkalosis" ,"Salt, Milk, Meats, Vegetables etc."),
        City_Founders4("Phosphorous" ,"","hypophosphatemia , rickets in children and osteomalacia in adults" ,"Meat, Fish, Poultry, Eggs, Milk, Bananas etc."),
        City_Founders4("Iodine" ,"","Goitre, Cretinism, Deterioration of Metabolism & Cellular Functioning" ,"Iodised Salt, Sea Food, Green Vegetables, Raw Milk, Eggs etc."),
        City_Founders4("Protein" ,"","Kwashiorkor" ,"Meat, Seafood, Eggs, Pulses & Legumes, Milk & Milk Products etc."),
        City_Founders4("Protein-Energy" ,"","Marasmus" ,"Grains, Pulses & Legumes, Meat, Milk & Milk Products, Eggs, Seafood etc")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_four_row)
        title="Nutrient Sources and their Deficiency diseases"


        val damname: TextView =findViewById(R.id.txt4rowElt1)
        val stale : TextView = findViewById(R.id.txt4rowElt2)
        val river : TextView = findViewById(R.id.txt4rowElt3)
        val year : TextView = findViewById(R.id.txt4rowElt4)
        damname.text = "Nutrients"
        stale.text = "Constituent"
        river.text="Defieciency Diseases"
        year.text="Sources"

        recyclernickname=findViewById(R.id.recyclercityfounderlist)
        recyclernickname.setHasFixedSize(true)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = CityFounderAdaptor(listofcity)
        recyclernickname.adapter = recyclerAdapter
        recyclernickname.layoutManager =  layoutManager
    }
}