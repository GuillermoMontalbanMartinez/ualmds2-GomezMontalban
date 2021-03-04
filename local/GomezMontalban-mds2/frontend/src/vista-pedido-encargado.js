import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaPedidoEncargado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="height: 100%; width: 100%; border: #ccc solid 2px; border-radius : 20px; background : #efefef; padding-right: var(--lumo-space-s); margin-bottom: var(--lumo-space-m); justify-content: flex-end;">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-shrink: 0; justify-content: center; align-items: center; margin-left: var(--lumo-space-xl); width: 15%; height: 60%;">
   <img style="height: 100%; width: 100%;">
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="height: 80%; justify-content: space-between; width: 100%; align-self: center;">
   <vaadin-vertical-layout theme="spacing" style="height: 10%; width: 100%; align-items: stretch; justify-content: center;">
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-wrap: wrap; justify-content: flex-start; flex-grow: 0; width: 95%; align-self: center;">
     <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; margin-left: var(--lumo-space-xl); justify-content: flex-start;">
      <p style="flex-grow: 0; flex-shrink: 0;">Paragraph</p>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1; flex-shrink: 0; flex-direction: column; justify-content: center; align-items: center; margin-right: var(--lumo-space-xl); height: 65%;">
    <p style="margin-top: var(--lumo-space-xl); width: 90%; height: 100%; background : white; border : 1px solid black;">Paragraph</p>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; align-items: flex-start; width: 100%; align-self: flex-start;">
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; justify-content: space-around; margin-bottom: var(--lumo-space-xl); padding-bottom: var(--lumo-space-xl);">
     <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; width: 53%; margin-bottom: var(--lumo-space-xl); align-self: flex-start; height: 10%;">
      <p style="flex-grow: 0; margin-left: var(--lumo-space-xl); align-self: center;">Paragraph</p>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing-s" style="width: 10%; height: 100%; flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin-right: var(--lumo-space-m);">
  <label style="flex-shrink: 0; align-self: center;">Estado</label>
  <vaadin-button theme="primary error" style="margin-left: var(--lumo-space-xs);">
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
