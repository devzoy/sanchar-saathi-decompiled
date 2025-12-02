package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

public class FlutterMutatorsStack {
    private List<Path> finalClippingPaths = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List<a> mutators = new ArrayList();

    public enum b {
        CLIP_RECT,
        CLIP_RRECT,
        CLIP_PATH,
        TRANSFORM,
        OPACITY
    }

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public List<a> getMutators() {
        return this.mutators;
    }

    public void pushClipRRect(int i4, int i5, int i6, int i7, float[] fArr) {
        Rect rect = new Rect(i4, i5, i6, i7);
        this.mutators.add(new a(rect, fArr));
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i4, int i5, int i6, int i7) {
        Rect rect = new Rect(i4, i5, i6, i7);
        this.mutators.add(new a(rect));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        a aVar = new a(matrix);
        this.mutators.add(aVar);
        this.finalMatrix.preConcat(aVar.a());
    }

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public Matrix f10340a;

        /* renamed from: b  reason: collision with root package name */
        public Rect f10341b;

        /* renamed from: c  reason: collision with root package name */
        public float[] f10342c;

        /* renamed from: d  reason: collision with root package name */
        public b f10343d;

        public a(Rect rect) {
            this.f10343d = b.CLIP_RECT;
            this.f10341b = rect;
        }

        public Matrix a() {
            return this.f10340a;
        }

        public a(Rect rect, float[] fArr) {
            this.f10343d = b.CLIP_RRECT;
            this.f10341b = rect;
            this.f10342c = fArr;
        }

        public a(Matrix matrix) {
            this.f10343d = b.TRANSFORM;
            this.f10340a = matrix;
        }
    }
}
