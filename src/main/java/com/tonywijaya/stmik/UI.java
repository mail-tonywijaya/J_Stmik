/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tonywijaya.stmik;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author tonyw
 */
public class UI 
{
    public void System()
    {
        try 
        {
                // Set System L&F
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (UnsupportedLookAndFeelException e) 
        {
           // handle exception
        }
        catch (ClassNotFoundException e) 
        {
           // handle exception
        }
        catch (InstantiationException e) 
        {
           // handle exception
        }
        catch (IllegalAccessException e) {
           // handle exception
        }
    }
    
    public void CrossPlatform()
    {
        try 
        {
                // Set System L&F
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } 
        catch (UnsupportedLookAndFeelException e) 
        {
           // handle exception
        }
        catch (ClassNotFoundException e) 
        {
           // handle exception
        }
        catch (InstantiationException e) 
        {
           // handle exception
        }
        catch (IllegalAccessException e) {
           // handle exception
        }
    }
}
