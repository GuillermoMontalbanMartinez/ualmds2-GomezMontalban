import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-producto-a-enviar`
 *
 * VistaProductoAEnviar element.
 *
 * @customElement
 * @polymer
 */
class VistaProductoAEnviar extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-producto-a-enviar';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductoAEnviar.is, VistaProductoAEnviar);
