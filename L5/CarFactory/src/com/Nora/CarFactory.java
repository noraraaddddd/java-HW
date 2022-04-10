package com.Nora;


    public class CarFactory {
        public static Car getCar(int c){
            switch (c) {
                case 1:
                    return new Kia();
                case 2:
                    return new Hyundai();
                case 3:
                    return new Nissan();
                default:
                    return null;
            }
        }
    }

