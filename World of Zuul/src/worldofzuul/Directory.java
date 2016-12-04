/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofzuul;

/**
 *
 * @author Fract
 */

import java.io.*;

public final class Directory 
{
    /**
     * Checks if a directory exist, and if it's a directory.
     * @param Directory
     * @return 
     */
    public static boolean ExistDirectory( String Directory )
    {   
        File dir = new File( Directory );
        
        try
        {
            boolean isDirectory = false;
            
            if( dir.isDirectory() )
                isDirectory = true;
            
            if( isDirectory == true )
                return dir.exists();
        }
        // IO Exception -> Remember
        catch( Exception E )
        {
            return false;   
        }
        
        return false;
    }
    
    /**
     * 
     * @param Directory
     * @param CreateRoots
     * @return 
     */
    public static boolean CreateDirectory( String Directory, boolean CreateRoots )
    {
        File dir = new File( Directory );
        
        try
        {
            boolean Exist = false;
            
            // Can Exist as a file and directory. so lets put it under the same type
                                                    // because java logic.......
            if( dir.exists() )
                Exist = true;
            
            // If it's a directory, no reason to try and create it again...
            if( Exist == true )
                if( dir.isDirectory() )
                    return false;
            
            if( CreateRoots )
                dir.mkdirs();
            else
                dir.mkdir();
        
            return true;
        }
        // Remember -> IO Exception, remember later
        catch( Exception E )
        {
            
        }
        
        return false;
    }
    
}