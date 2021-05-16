import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaProducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; border: #ccc solid 2px; border-radius : 20px; background: radial-gradient(circle, rgba(174,238,236,1) 63%, rgba(239,248,249,1) 100%); height: 100%;">
 <vaadin-horizontal-layout style="width: 100%;">
  <vaadin-horizontal-layout>
   <label>Nombre del producto </label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 25%;">
   <vaadin-text-field readonly></vaadin-text-field>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%;">
  <vaadin-horizontal-layout style="width: 50%; height: 100%;">
   <vaadin-vertical-layout style="width: 100%; height: 50%;">
    <vaadin-vertical-layout style="width: 100%; height: 50%;">
     <img style="width: 100%; height: 100%;">
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 50%;">
     <vaadin-horizontal-layout style="width: 100%; height: 100%;">
      <vaadin-horizontal-layout style="width: 25%; height: 25%;">
       <img style="width: 100%; height: 100%;">
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout style="width: 25%; height: 25%;">
       <img style="width: 100%; height: 100%;">
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout style="height: 25%; width: 25%;">
       <img style="width: 100%; height: 100%;">
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout style="width: 25%; height: 25%;">
       <img style="width: 100%; height: 100%;">
      </vaadin-horizontal-layout>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 50%;">
   <vaadin-vertical-layout style="width: 100%;">
    <vaadin-vertical-layout style="width: 100%; align-items: center; justify-content: center;">
     <vaadin-horizontal-layout>
      <vaadin-horizontal-layout style="align-self: center; align-items: center; justify-content: center;">
       <label style="align-self: center;">Descripcion</label>
      </vaadin-horizontal-layout>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 30%;">
     <vaadin-text-area style="width: 100%; height: 100%;" readonly></vaadin-text-area>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%;">
     <vaadin-horizontal-layout style="align-self: center;">
      <vaadin-horizontal-layout style="margin: var(--lumo-space-m);">
       <label>Precio</label>
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout style="margin: var(--lumo-space-m);">
       <vaadin-text-field readonly></vaadin-text-field>
      </vaadin-horizontal-layout>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="width: 100%;">
  <vaadin-horizontal-layout style="width: 100%;">
   <vaadin-horizontal-layout style="width: 50%;">
    <vaadin-horizontal-layout>
     <label style="margin: var(--lumo-space-m);">Valoracion media</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout>
     <vaadin-text-field style="margin: var(--lumo-space-m);" readonly></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 50%;">
    <vaadin-horizontal-layout>
     <vaadin-button theme="icon" aria-label="Add new" id="agregarAlCarrito" style="margin: var(--lumo-space-m);">
      <iron-icon icon="lumo:plus"></iron-icon>
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout>
     <label style="margin: var(--lumo-space-m);">Carrito</label>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout>
  <h2 style="margin: var(--lumo-space-xl);">Reseñas</h2>
  <vaadin-vertical-layout style="width: 100%;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-producto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProducto.is, VistaProducto);
