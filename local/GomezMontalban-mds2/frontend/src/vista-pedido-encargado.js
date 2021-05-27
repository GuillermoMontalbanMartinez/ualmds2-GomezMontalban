import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaPedidoEncargado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="layoutVistaEncargado">
 <vaadin-horizontal-layout theme="spacing" style="height: 100%; width: 80%; border: #ccc solid 2px; border-radius : 20px;">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-shrink: 0; justify-content: center; align-items: center; margin-left: var(--lumo-space-xl); width: 30%; height: 80%;">
   <img style="align-self: flex-start; height: 100%; width: 100%;" id="imagen">
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="height: 80%; justify-content: space-between; width: 100%; align-self: center;">
   <vaadin-vertical-layout theme="spacing" style="height: 10%; width: 100%; align-items: stretch; justify-content: center;">
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-wrap: wrap; justify-content: flex-start; flex-grow: 0; width: 95%; align-self: center;">
     <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; margin-left: var(--lumo-space-xl); justify-content: flex-start;">
      <p style="flex-grow: 0; flex-shrink: 0;">Nombre :</p>
      <vaadin-text-field id="nombreText" style="align-self: center;" readonly></vaadin-text-field>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1; flex-shrink: 0; flex-direction: column; justify-content: center; align-items: center; margin-right: var(--lumo-space-xl); height: 65%;">
    <vaadin-text-area id="textDescripcion" style="width: 100%; height: 100%;" readonly></vaadin-text-area>
    <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; width: 53%; align-self: flex-start; height: 20%;">
     <p style="flex-grow: 0; margin-left: var(--lumo-space-xl); align-self: center;">Cantidad: </p>
     <vaadin-text-field id="cantidadText" readonly></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 10%; height: 100%; flex-shrink: 0; align-self: center; justify-content: center; margin-right: var(--lumo-space-m); align-items: center;">
  <vaadin-horizontal-layout style="align-self: flex-start;">
   <label style="flex-shrink: 0; align-self: center;">Estado:</label>
   <vaadin-text-field id="textEstadoDelPedido" readonly></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-button theme="primary error" style="margin-left: var(--lumo-space-xl);" id="buttonCancelar">
    Cancelar 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-pedido-encargado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidoEncargado.is, VistaPedidoEncargado);
