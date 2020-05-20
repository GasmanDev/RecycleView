package vn.edu.ntu.huunhat.recycleview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import vn.edu.ntu.huunhat.model.Product;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView txtNamePro, txtPrice, txtDesc;
        ImageView imvaddToCart;
        Product product;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNamePro = this.itemView.findViewById(R.id.txtNamePro);
            txtPrice = this.itemView.findViewById(R.id.txtPrice);
            txtDesc = this.itemView.findViewById(R.id.txtDesc);
            imvaddToCart = this.itemView.findViewById(R.id.imvAddToCart);
        }
        public void bind(Product product)
        {
            this.product = product;
            txtNamePro.setText(product.getName());
            txtPrice.setText(new Integer(product.getPrice()).toString());
            txtDesc.setText(product.getDesc());
        }
    }
    private class Adapter extends RecyclerView.Adapter<ProductViewHolder> {
        List<Product> productList;

        public Adapter(List<Product> productList) {
            this.productList = productList;
        }

        @NonNull
        @Override
        public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.product, parent, false);
            return new ProductViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
            holder.bind(productList.get(position));
        }

        @Override
        public int getItemCount() {
            return productList.size();
        }
    }
}
