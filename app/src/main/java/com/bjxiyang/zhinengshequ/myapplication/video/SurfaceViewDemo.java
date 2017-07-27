package com.bjxiyang.zhinengshequ.myapplication.video;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by zhide on 2017/7/23.
 */

    public class SurfaceViewDemo extends SurfaceView implements SurfaceHolder.Callback {

        private SurfaceHolder holder;
        private RenderThread renderThread;
        private boolean isDraw = false;// 控制绘制的开关

        public SurfaceViewDemo(Context context) {
            super(context);
            holder = this.getHolder();
            holder.addCallback(this);

            renderThread = new RenderThread();
        }

        @Override
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        }

        @Override
        public void surfaceCreated(SurfaceHolder holder) {
            isDraw = true;
            renderThread.start();

        }

        @Override
        public void surfaceDestroyed(SurfaceHolder holder) {
            isDraw = false;

        }

        /**
         * 绘制界面的线程
         *
         * @author Administrator
         *
         */
        private class RenderThread extends Thread {
            @Override
            public void run() {
                // 不停绘制界面
                while (isDraw) {
                    drawUI();
                }
                super.run();
            }
        }

        /**
         * 界面绘制
         */
        public void drawUI() {
            Canvas canvas = holder.lockCanvas();
            try {
                drawCanvas(canvas);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                holder.unlockCanvasAndPost(canvas);
            }
        }

        private void drawCanvas(Canvas canvas) {
            // 在 canvas 上绘制需要的图形
        }
    }

