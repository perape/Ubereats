package edu.itesm.uber_eats_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var valor=0
    var smallorderfee:Double=0.0
    var servicefee:Double=0.0
    var deliverfee:Double=0.0
    var propina:Double=1.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        int()
        tips()
    }
    fun int(){
        editTextNumber.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                valor=s.toString().toInt()
                smallorderfee=valor*.02
                servicefee=valor*.05
                deliverfee=valor*.1
                button5.text="Place Order - Delivery- $ ${(valor+smallorderfee+servicefee+deliverfee)*propina}"
                textView12.text="$ $smallorderfee"
                textView13.text="$ $servicefee"
                textView15.text="$ $deliverfee"

            }

        })
    }
    fun tips(){
        button.setOnClickListener {
            propina=1.1
            button5.text="Place Order - Delivery- $ ${(valor+smallorderfee+servicefee+deliverfee)*propina}"
        }
        button1.setOnClickListener {
            propina=1.15
            button5.text="Place Order - Delivery- $ ${(valor+smallorderfee+servicefee+deliverfee)*propina}"
        }
        button2.setOnClickListener {
            propina=1.2
            button5.text="Place Order - Delivery- $ ${(valor+smallorderfee+servicefee+deliverfee)*propina}"
        }
        button3.setOnClickListener {
            propina=1.25
            button5.text="Place Order - Delivery- $ ${(valor+smallorderfee+servicefee+deliverfee)*propina}"
        }
        button4.setOnClickListener {
            propina=1.00
            button5.text="Place Order - Delivery- $ ${(valor+smallorderfee+servicefee+deliverfee)*propina}"
        }
        button5.setOnClickListener {
            valor=0
            smallorderfee=0.0
            servicefee=0.0
            deliverfee=0.0
            propina=1.00
            textView12.text="$ $smallorderfee"
            textView13.text="$ $servicefee"
            textView15.text="$ $deliverfee"
            button5.text="Place Order - Delivery"
        }
    }
}