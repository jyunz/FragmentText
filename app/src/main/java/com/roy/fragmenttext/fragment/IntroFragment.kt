package com.roy.fragmenttext.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.roy.fragmenttext.R
import com.roy.fragmenttext.adapter.IntroAdapter
import com.roy.fragmenttext.data.MemberData
import kotlinx.android.synthetic.main.fragment_intro.*

class IntroFragment : Fragment() {

    val mIntroMemberDataList = ArrayList<MemberData>()

    lateinit var mIntroAdapter : IntroAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_intro, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mIntroMemberDataList.add(MemberData("김남준", "리더,메인래퍼"))
        mIntroMemberDataList.add(MemberData("김석진", "서브보컬"))
        mIntroMemberDataList.add(MemberData("민윤기", "리드래퍼"))
        mIntroMemberDataList.add(MemberData("정호석", "메인댄서,서브래퍼"))
        mIntroMemberDataList.add(MemberData("박지민", "리드보컬"))
        mIntroMemberDataList.add(MemberData("김태형", "서브보컬"))
        mIntroMemberDataList.add(MemberData("전정국", "메인보컬"))

        mIntroAdapter = IntroAdapter(requireContext(), R.layout.intro_list_item, mIntroMemberDataList)

//        introListView.adapter = mIntroAdapter
//        introListView.setOnItemClickListener { parent, view, position, id ->
//
//            val clickedMember = mIntroMemberDataList[position]
//            val myIntent = Intent(requireContext(),)
//        }
    }


}