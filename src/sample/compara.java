package sample;

import java.util.ArrayList;

public class compara {
    public static ArrayList<Usuario> usuario = new ArrayList<>();
    public static ArrayList<Usuario> usuarioconexo = new ArrayList<>();
    public ArrayList<Usuario> comparando(Usuario u){
        int a,b,c,d,e,f,g,h,i;
        Usuario us = new Usuario();
       usuario = us.pegarUsuarios();
       for( Usuario dio : usuario){
          a = (u.rk - dio.rk);
           b = (u.pp - dio.pp);
           c = (u.rp - dio.rp);
           d = (u.ie - dio.ie);
           e = (u.mb - dio.mb);
           f = (u.eo - dio.eo);
           g = (u.hl - dio.hl);
           h = (u.hp - dio.hp);
           i=a+b+c+d+e+f+g+h;
           if(i<=8){
               usuarioconexo.add(dio);
               return (usuarioconexo);
           }
          //rk,pp,rp,ie,mb,eo,hl,hp;
       }
        return null;
    }
}
