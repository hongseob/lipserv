package com.lip;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class bot extends ListenerAdapter {
    public String prefix="!";
    public static void main(String[] args) throws LoginException {
        JDA jda= JDABuilder.createDefault("OTMxNTY1MjY5ODEyNDA0MjY1.YeGRww.26u3CHsy2zNmLUBD_8Bxl_cOMRc").build();
        jda.addEventListener(new bot());
    }
    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        User user=event.getAuthor();
        if(event.getMessage().getContentRaw().equals(prefix+"hello")){
            event.getChannel().sendMessage("Hello!"+user.getAsMention()).queue();
        }
    }
}
