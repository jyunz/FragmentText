package com.roy.fragmenttext.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.roy.fragmenttext.R
import com.roy.fragmenttext.data.MemberData

class IntroAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : List<MemberData>) : ArrayAdapter<MemberData>(mContext, resId, mList){

    val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inflater.inflate(R.layout.intro_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]

        val memberNameTxt = row.findViewById<TextView>(R.id.memberName)

        memberNameTxt.text = data.name

        return row

    }
}