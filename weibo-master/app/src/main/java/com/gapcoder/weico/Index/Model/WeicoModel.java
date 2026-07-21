package com.gapcoder.weico.Index.Model;

import com.gapcoder.weico.General.SysMsg;

import java.util.LinkedList;
import java.util.List;

public class WeicoModel extends SysMsg{
    private LinkedList<InnerBean> inner;

    public LinkedList<InnerBean> getInner() {
        return inner;
    }

    public void setInner(LinkedList<InnerBean> inner) {
        this.inner = inner;
    }

    public static class InnerBean {
        /**
         * id : 29
         * uid : 4
         * name : Apple
         * face : http://10.0.2.2/weico/face/f4.jpg
         * text : this is a beautiful day! @gapcoder @Apple
         * time : 1520419999
         * comment : 0
         * love : 0
         */

        private int id;
        private int uid;
        private String name;
        private String face;
        private String text;
        private int time;
        private int comment;
        private int love;
        private String photo;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFace() {
            return face;
        }

        public void setFace(String face) {
            this.face = face;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public int getComment() {
            return comment;
        }

        public void setComment(int comment) {
            this.comment = comment;
        }

        public int getLove() {
            return love;
        }

        public void setLove(int love) {
            this.love = love;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }
    }
}
