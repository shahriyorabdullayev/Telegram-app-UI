package com.example.m5_l3_telegramui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.m5_l3_telegramui.R
import com.example.m5_l3_telegramui.adapter.ChatAdapter
import com.example.m5_l3_telegramui.model.Chat


class ChatFragment : Fragment() {

    private lateinit var rvMain: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_chat, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {

        rvMain = view.findViewById(R.id.rv_main)
        rvMain.layoutManager = GridLayoutManager(context, 1)

        refreshAdapter(getAllChats())

    }

    private fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        rvMain.adapter = adapter

    }

    private fun getAllChats():ArrayList<Chat> {
        val chats = ArrayList<Chat>()

        for (i in 0..5){

            chats.add(Chat(R.drawable.img_my, "Shahriyor Abdullayev", "Assalomu alaykum"))
            chats.add(Chat(R.drawable.img_my, "Shahriyor Abdullayev", "Assalomu alaykum"))
            chats.add(Chat(R.drawable.img_my, "Shahriyor Abdullayev", "Assalomu alaykum"))
            chats.add(Chat(R.drawable.img_my, "Shahriyor Abdullayev", "Assalomu alaykum"))
            chats.add(Chat(R.drawable.img_my, "Shahriyor Abdullayev", "Assalomu alaykum"))
            chats.add(Chat(R.drawable.img_my, "Shahriyor Abdullayev", "Assalomu alaykum"))
            chats.add(Chat(R.drawable.img_my, "Shahriyor Abdullayev", "Assalomu alaykum"))
            chats.add(Chat(R.drawable.img_my, "Shahriyor Abdullayev", "Assalomu alaykum"))
        }
        return chats
    }


}