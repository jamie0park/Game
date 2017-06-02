package kr.study.game;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/**
 * 게임 화면을 그리기 위한 TextureView
 */

public class GameView extends TextureView implements TextureView.SurfaceTextureListener {
    /**
     * 슈퍼 클래스에는 기본 생성자가 없으므로 인수가 있는 생성자를 명시적으로 호출한다
     *
     * @param context
     */
    public GameView(Context context) {
        super(context); // 슈퍼 클래스의 생성자를 인수 context로 호출한다

        setSurfaceTextureListener(this);
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {

    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {

    }

    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {

    }
}
