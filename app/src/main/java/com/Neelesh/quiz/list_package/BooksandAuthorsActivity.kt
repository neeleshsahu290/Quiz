package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.StateCapitalAdaptor
import com.Neelesh.quiz.data_class.State_Capital

class BooksandAuthorsActivity : AppCompatActivity() {

    lateinit var recyclerNationalpark : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: StateCapitalAdaptor
    val listofpark = arrayListOf<State_Capital>(
        State_Capital("Wings of fire" ,"A P J Abdul Kalam"),
                State_Capital("Truth Love and little Malice" ,"Khushwanth Singh"),
                State_Capital("The race of my life" ,"Milkha singh"),
                State_Capital("My Country My life" ,"L K Advani"),
                State_Capital("One life is not enough" ,"K Natwar singh"),
                State_Capital("The test of My life" ,"Yuvraj singh"),
                State_Capital("An Autobiography" ,"Jawaharlal Nehru"),
                State_Capital("Playing it my way" ,"Sachin Tendulkar"),
                State_Capital("Matters of Discretion" ,"I K Gujral"),
                State_Capital("A Shot at history" ,"Abhinav Bindra"),
                State_Capital("Straight from the heart" ,"Kapildev"),
                State_Capital("My times" ,"J B Kripalani(acharya kripalani)"),
                State_Capital("Autobiographyof Yogi" ,"Paramahamsa Yogananda"),
                State_Capital("The Z Factor" ,"Subhash Chandra"),
                State_Capital("Mein Kampf" ,"Adolf Hitler"),
                State_Capital("My Experiments with Truth" ,"M K Gandhi"),
                State_Capital("Losing My virginity" ,"Richard Branson"),
                State_Capital("My Brief History" ,"Stephen Hawking"),
                State_Capital("Moon Walk" ,"Michael Jackson"),
                State_Capital("The Snowball:Warren buffett and business of life" ,"Alice Schroeder"),
                State_Capital("Raga Mala" ,"Pandit Ravi Shankar"),
                State_Capital("The Score of My life" ,"Zubin Mehta"),
                State_Capital("Long walk to freedom" ,"Nelson Mandela"),
                State_Capital("Open" ,"Andre Agassi"),
                State_Capital("The Story of My life" ,"Helen Keller"),
                State_Capital("Any thing But Khamosh" ,"Shatrugan Sinha"),
                State_Capital("Then One Day" ,"Naseeruddin Shah"),
                State_Capital("Sunny Days:An Auto biography" ,"Sunil Gavaskar"),
                State_Capital("Un breakable" ,"Mary Com"),
                State_Capital("An Auto biographical study" ,"Sigmund Freud"),
                State_Capital("The Words" ,"Jean Paul Sartre"),
                State_Capital("My story" ,"Marilyne Monroe"),
                State_Capital("The Greatest:My Own Story" ,"Muhammad Ali"),
        State_Capital("The Nice Guy who finished first(Rahul Dravid biography)" ,"Prabhu desai"),
                State_Capital("Golden Girl" ,"P T Usha(Athlete)"),
                State_Capital("Faster Than Lightening:My autobiography" ,"Usain Bolt(Athlete)"),
                State_Capital("KP:The Auto biography" ,"Kevin Pietersen(South Africa Cricketer)"),
                State_Capital("Auto biographical Notes" ,"Albert Einstein"),
                State_Capital("My Life" ,"Bill Clinton"),
                State_Capital("Living History" ,"Hillary Clinton"),
                State_Capital("The Fall of a Sparrow" ,"Salim Ali(Ornithologist)"),
                State_Capital("Wandering in Many worlds" ,"V R K Iyer"),
                State_Capital("An American life" ,"Ronald Reagan(Former America President)"),
                State_Capital("The bandit Queen of India" ,"Phoolan devi"),
                State_Capital("The Substance and the Shadow" ,"Dilip Kumar"),
                State_Capital("My Confession" ,"Leo Tolstoy"),
                State_Capital("Songs My mother taught" ,"Marlon Brando"),
                State_Capital("My Child hood" ,"Maxim Gorkhy"),
                State_Capital("De Profundis" ,"Oscar Wilde"),
                State_Capital("Walk this Way" ,"Aero Smith"),
                State_Capital("Daughter of the Destiny" ,"Benazir Bhutto"),
                State_Capital("Wasim:Auto biography" ,"Wasim Akram(Pakistan Cricketer)"),
                State_Capital("Controversially yours" ,"Shoaib Akhtar(Pakistan Fast bowler)"),
        State_Capital("It's not about the bike:My Journey back to life" ,"Lance Armstrong"),
    State_Capital("On writing" ,"Stephen King"),
    State_Capital("The Auto biography of An Unknown Indian" ,"Nirad C Chaudhuri"),
    State_Capital("Dreams from my Father" ,"Barack Obama"),
    State_Capital("My days" ,"R K Narayan"),
    State_Capital("Revenue Stamp:An Autobiography" ,"Amrita Pritam")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_two_row)
        title="Books and Authors"

        var country : TextView = findViewById(R.id.txt2rowElt1)
        var bank : TextView = findViewById(R.id.txt2rowElt2)
        country.text="Book"
        bank.text = "Author"

        recyclerNationalpark=findViewById(R.id.recyclerstatecapitallist)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = StateCapitalAdaptor(listofpark)
        recyclerNationalpark.adapter = recyclerAdapter
        recyclerNationalpark.layoutManager =  layoutManager
    }
}